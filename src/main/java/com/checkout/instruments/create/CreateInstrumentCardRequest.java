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

    @SerializedName("account_holder")
    private AccountHolder accountHolder;

    private CreateCustomerInstrumentRequest customer;

    @Builder
    private CreateInstrumentCardRequest(final AccountHolder accountHolder,
                                         final CreateCustomerInstrumentRequest customer) {
        super(InstrumentType.CARD);
        this.accountHolder = accountHolder;
        this.customer = customer;
    }

    public CreateInstrumentCardRequest() {
        super(InstrumentType.CARD);
    }

}
