package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // Create an instance of ConfigurationQuery with sample data
        ConfigurationQuery configurationQuery = new ConfigurationQuery();
        configurationQuery.setIdContext("context_value");
        configurationQuery.setIdKpi("kpi_value");
        configurationQuery.setDesOutField("output_field");
        configurationQuery.setDesFormula("formula_value");
        configurationQuery.setNamDataSource("data_source_name");
        configurationQuery.setDesFilter("filter_condition");
        configurationQuery.setCodRank("rank_code");

        // Build the custom query
        String customQuery = buildCustomQuery(configurationQuery);

        System.out.println("HELLO");

        // Print the custom query
        System.out.println(customQuery);
    }

    private static String buildCustomQuery(ConfigurationQuery configurationQuery) {
        return String.format(
                "INSERT INTO M_KPI_VALUE_TMP (datRef, idTransaction, codCurr, idKpi, %s, %s, %s) " +
                        "SELECT %s FROM %s WHERE %s",
                configurationQuery.getDesOutField(),
                configurationQuery.getIdContext(),
                configurationQuery.getCodRank(),
                configurationQuery.getDesFormula(),
                configurationQuery.getNamDataSource(),
                configurationQuery.getDesFilter()
        );
    }
}
