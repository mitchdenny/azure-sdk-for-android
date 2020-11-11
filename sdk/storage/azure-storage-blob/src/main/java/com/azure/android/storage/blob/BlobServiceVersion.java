// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.android.storage.blob;


/**
 * The versions of Azure Storage Blob supported by this client library.
 */
public enum BlobServiceVersion {
    V2019_02_02("2019-02-02"),
    V2019_07_07("2019-07-07"),
    V2019_12_12("2019-12-12"),
    V2020_02_10("2020-02-10");

    private final String version;

    BlobServiceVersion(String version) {
        this.version = version;
    }

    /**
     * Gets the version.
     *
     * @return the version.
     */
    public String getVersion() {
        return this.version;
    }

    /**
     * Gets the latest service version supported by this client library
     *
     * @return the latest {@link BlobServiceVersion}
     */
    public static BlobServiceVersion getLatest() {
        return V2020_02_10;
    }
}