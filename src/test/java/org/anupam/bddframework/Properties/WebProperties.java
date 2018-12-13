package org.anupam.bddframework.Properties;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component
@ConfigurationProperties("web")
public class WebProperties {
    private Map<String, String> endpoint = new HashMap();

    public String endpoint(String name) {
        return (String) this.endpoint.get(name);
    }

    public WebProperties() {
    }

    public Map<String, String> getEndpoint() {
        return this.endpoint;
    }

    public void setEndpoint(Map<String, String> endpoint) {
        this.endpoint = endpoint;
    }

    public boolean equals(Object o) {
        if (o == this) {
            return true;
        } else if (!(o instanceof WebProperties)) {
            return false;
        } else {
            WebProperties other = (WebProperties)o;
            if (!other.canEqual(this)) {
                return false;
            } else {
                Object this$endpoint = this.getEndpoint();
                Object other$endpoint = other.getEndpoint();
                if (this$endpoint == null) {
                    if (other$endpoint != null) {
                        return false;
                    }
                } else if (!this$endpoint.equals(other$endpoint)) {
                    return false;
                }

                return true;
            }
        }
    }

    protected boolean canEqual(Object other) {
        return other instanceof WebProperties;
    }

    public int hashCode() {
        boolean PRIME = true;
        int result = 1;
        Object $endpoint = this.getEndpoint();
        result = result * 59 + ($endpoint == null ? 43 : $endpoint.hashCode());
        return result;
    }

    public String toString() {
        return "WebProperties(endpoint=" + this.getEndpoint() + ")";
    }
}
