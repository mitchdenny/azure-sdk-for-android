// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.android.core.http.policy;

import com.azure.android.core.http.HttpPipelinePolicy;
import com.azure.android.core.http.HttpPipelinePolicyChain;
import com.azure.android.core.http.HttpRequest;
import com.azure.android.core.credential.AzureKeyCredential;
import com.azure.android.core.http.implementation.Util;
import com.azure.android.core.logging.ClientLogger;

/**
 * Pipeline policy that uses an {@link AzureKeyCredential} to set the authorization key for a request.
 * <p>
 * Requests sent with this pipeline policy are required to use {@code HTTPS}. If the request isn't using {@code HTTPS}
 * an exception will be thrown to prevent leaking the key.
 */
public class AzureKeyCredentialPolicy implements HttpPipelinePolicy {
    private final ClientLogger logger = new ClientLogger(AzureKeyCredentialPolicy.class);

    private final String name;
    private final AzureKeyCredential credential;

    /**
     * Creates a policy that uses the provided {@link AzureKeyCredential} to set the specified header name.
     *
     * @param name The name of the key header that will be set to {@link AzureKeyCredential#getKey()}.
     * @param credential The {@link AzureKeyCredential} containing the authorization key to use.
     * @throws NullPointerException If {@code name} or {@code credential} is {@code null}.
     * @throws IllegalArgumentException If {@code name} is empty.
     */
    public AzureKeyCredentialPolicy(String name, AzureKeyCredential credential) {
        Util.requireNonNull(credential, "'credential' cannot be null.");
        Util.requireNonNull(name, "'name' cannot be null.");
        if (name.isEmpty()) {
            throw logger.logExceptionAsError(new IllegalArgumentException("'name' cannot be empty."));
        }

        this.name = name;
        this.credential = credential;
    }

    @Override
    public void process(HttpPipelinePolicyChain chain) {
        if ("http".equals(chain.getRequest().getUrl().getProtocol())) {
            chain.completedError(
                new IllegalStateException("Key credentials require HTTPS to prevent leaking the key."));
        } else {
            HttpRequest httpRequest = chain.getRequest();
            httpRequest.setHeader(name, credential.getKey());
            chain.processNextPolicy(httpRequest);
        }
    }
}
