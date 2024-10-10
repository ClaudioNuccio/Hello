package org.example;

class ConfigurationQuery {
    private String idContext;
    private String idKpi;
    private String desOutField;
    private String desFormula;
    private String namDataSource;
    private String desFilter;
    private String valRate;
    private String codRank;

    // Getters and Setters
    public String getIdContext() {
        return idContext;
    }

    public void setIdContext(String idContext) {
        this.idContext = idContext;
    }

    public String getIdKpi() {
        return idKpi;
    }

    public void setIdKpi(String idKpi) {
        this.idKpi = idKpi;
    }

    public String getDesOutField() {
        return desOutField;
    }

    public void setDesOutField(String desOutField) {
        this.desOutField = desOutField;
    }

    public String getDesFormula() {
        return desFormula;
    }

    public void setDesFormula(String desFormula) {
        this.desFormula = desFormula;
    }

    public String getNamDataSource() {
        return namDataSource;
    }

    public void setNamDataSource(String namDataSource) {
        this.namDataSource = namDataSource;
    }

    public String getDesFilter() {
        return desFilter;
    }

    public void setDesFilter(String desFilter) {
        this.desFilter = desFilter;
    }

    public String getValRate() {
        return valRate;
    }

    public void setValRate(String valRate) {
        this.valRate = valRate;
    }

    public String getCodRank() {
        return codRank;
    }

    public void setCodRank(String codRank) {
        this.codRank = codRank;
    }
}