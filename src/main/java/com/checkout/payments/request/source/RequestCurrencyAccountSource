package com.checkout.payments.request.source;

import com.checkout.common.PaymentSourceType;
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
public final class RequestCurrencyAccountSource extends AbstractRequestSource {

  private String id;
  
  @Builder
  private RequestCurrencyAccountSource(final String id) {
      super(PaymentSourceType.CURRENCY_ACCOUNT);
      this.id = id;
  }

  public RequestCurrencyAccountSource() {
      super(PaymentSourceType.CURRENCY_ACCOUNT);
  }
}
