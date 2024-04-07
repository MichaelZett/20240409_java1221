package de.zettsystems.stringtemplate;

import java.text.MessageFormat;
import java.util.List;

public class StringTemplate {
    public static void main(String[] args) {
        compose("fine", "27", "Celsius").forEach(System.out::println);
    }

    static List<String> compose(String feelsLike, String temperature, String unit) {
        String plus = "Today's weather is " + feelsLike +
                ", with a temperature of " + temperature + " degrees " + unit;
        String stringBuilder = new StringBuilder()
                .append("Today's weather is ")
                .append(feelsLike)
                .append(", with a temperature of ")
                .append(temperature)
                .append(" degrees ")
                .append(unit)
                .toString();
        String format = String.format("Today's weather is %s, with a temperature of %s degrees %s",
                feelsLike, temperature, unit);
        String formatted = "Today's weather is %s, with a temperature of %s degrees %s".formatted(
                feelsLike, temperature, unit);
        String messageFormat = MessageFormat.format("Today''s weather is {0}, with a temperature of {1} degrees {2}",
                feelsLike, temperature, unit);
        String template = STR."Today's weather is \{feelsLike}, with a temperature of \{temperature} degrees \{unit}";
        return List.of(plus, stringBuilder, format, formatted, messageFormat, template);
    }
}
