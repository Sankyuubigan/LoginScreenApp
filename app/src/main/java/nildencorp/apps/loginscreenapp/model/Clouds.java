
package nildencorp.apps.loginscreenapp.model;

import java.util.HashMap;
import java.util.Map;


public class Clouds {

    private Integer all;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    public void setAll(Integer all) {
        this.all = all;
    }

    public Map<String, Object> getAdditionalProperties() {
        return additionalProperties;
    }

    public void setAdditionalProperties(Map<String, Object> additionalProperties) {
        this.additionalProperties = additionalProperties;
    }
}
