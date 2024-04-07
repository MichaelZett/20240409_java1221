package de.zettsystems.exercises;

public class QueryProvider {

    public String getQuery() {
        // TODO make it more readable
        String query = "SELECT new de.zettsystems.uebung1416.BookAuthorReviewCount(" +
                "b.title, concat(a.firstName, ' ', a.lastName), size(b.reviews)) " +
                "FROM Book b JOIN b.author a GROUP BY b.title, a.firstName, a.lastName";
        return query;
    }
}
