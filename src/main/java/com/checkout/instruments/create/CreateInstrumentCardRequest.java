package com.checkout.instruments.create;

import com.checkout.common.AccountHolder;
import com.checkout.common.InstrumentType;
import com.google.gson.annotations.SerializedName;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
public final class CreateInstrumentCardRequest extends CreateInstrumentRequest {

    private String number;

    @SerializedName("expiry_month")
    private Integer expiryMonth;

    @SerializedName("expiry_year")
    private Integer expiryYear;
    
    @SerializedName("processing_channel_id")
    private String processingChannelId;
    
    @SerializedName("account_holder")
    private AccountHolder accountHolder;

    private CreateCustomerInstrumentRequest customer;

    @Builder
    private CreateInstrumentCardRequest(final String number,
                                        final Integer expiryMonth,
                                        final Integer expiryYear,
                                        final String processingChannelId,
                                        final AccountHolder accountHolder,
                                        final CreateCustomerInstrumentRequest customer) {
        super(InstrumentType.CARD);
        this.number = number;
        this.expiryMonth = expiryMonth;
        this.expiryYear = expiryYear;
        this.processingChannelId = processingChannelId;
        this.accountHolder = accountHolder;
        this.customer = customer;
    }

    public CreateInstrumentCardRequest() {
        super(InstrumentType.CARD);
    }

}
