package com.checkout.common;

import com.google.gson.annotations.SerializedName;

public enum AccountHolderIdentificationType {

    @SerializedName("passport")
    PASSPORT,

    @SerializedName("driving_license")
    DRIVING_LICENSE,

    @SerializedName("national_id")
    NATIONAL_ID,

    @SerializedName("company_registration")
    COMPANY_REGISTRATION,

    @SerializedName("tax_id")
    TAX_ID
}
