package workerversion.model;

import workerversion.model.CustomerInfoDatabase;

public interface CustomerInfoDatabase {
    CustomerInfo get(String customerID);
}
