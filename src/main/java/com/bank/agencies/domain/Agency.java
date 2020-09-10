package com.bank.agencies.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Agency implements Serializable {

    private static final long serialVersionUID = -1491071762041597641L;

    @JsonProperty("NomeAgencia")
    private String name;
    @JsonProperty("NomeIf")
    private String bank;
    @JsonProperty("Municipio")
    private String city;
    @JsonProperty("UF")
    private String state;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBank() {
        return bank;
    }

    public void setBank(String bank) {
        this.bank = bank;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }


    public static final class AgencyBuilder {
        private String name;
        private String bank;
        private String city;
        private String state;

        private AgencyBuilder() {
        }

        public static AgencyBuilder anAgency() {
            return new AgencyBuilder();
        }

        public AgencyBuilder name(String name) {
            this.name = name;
            return this;
        }

        public AgencyBuilder bank(String bank) {
            this.bank = bank;
            return this;
        }

        public AgencyBuilder city(String city) {
            this.city = city;
            return this;
        }

        public AgencyBuilder state(String state) {
            this.state = state;
            return this;
        }

        public Agency build() {
            Agency agency = new Agency();
            agency.setName(name);
            agency.setBank(bank);
            agency.setCity(city);
            agency.setState(state);
            return agency;
        }
    }
}
