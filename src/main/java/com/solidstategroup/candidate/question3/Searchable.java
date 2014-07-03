package com.solidstategroup.candidate.question3;

import java.io.IOException;
import java.util.List;

/**
 *  Interface for a single Searchable resource
 */
public interface Searchable {

    /**
     * Perform a Search.
     *
     * @param query Query search string.
     * @return A List of search results from querying this Searchable.
     * @throws IOException if an error occurs performing the search.
     */
    public List<String> search(String query) throws IOException;
}
