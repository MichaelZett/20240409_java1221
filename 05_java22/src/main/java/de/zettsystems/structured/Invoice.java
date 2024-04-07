package de.zettsystems.structured;

import java.util.List;

public record Invoice(Issuer issuer, Customer customer, List<Item> items) {
}
