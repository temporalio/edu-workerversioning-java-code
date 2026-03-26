package workerversion;

import io.temporal.activity.ActivityInterface;
import workerversion.model.ChargeInput;
import workerversion.model.CustomerInfo;

@ActivityInterface
public interface LoanProcessingActivities {

  public String chargeCustomer(ChargeInput input);

  public String sendThankYouToCustomer(CustomerInfo input);

}
