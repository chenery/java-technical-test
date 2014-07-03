package com.solidstategroup.candidate.question3;

import java.io.IOException;
import java.util.List;

/**
 *  Interface for a generic Search
 */
public interface Search {

    /**
     * Perform Search for a query.
     *
     * @param query a single search query represented as a String.
     * @return A List of search results from this search.
     * @throws IOException if an error occurs performing the search.
     */
    public List<String> search(String query) throws IOException;
}
