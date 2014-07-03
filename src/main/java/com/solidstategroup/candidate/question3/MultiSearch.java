package com.solidstategroup.candidate.question3;

import java.io.IOException;
import java.util.List;

/**
 * Abstract base class for combining the results of multiple {@link Searchable} objects.
 */
public abstract class MultiSearch implements Searchable {

    private List<Searchable> searchables = null;

    /**
     * @return the Searchables set on this MultiSearch.
     */
    public List<Searchable> getSearchables() {
        return searchables;
    }

    /**
     * Sets the Searchable objects to be called for a search.
     *
     * @param searchables All {@link Searchable} implementations to be called for a search.
     */
    public void setSearchables(List<Searchable> searchables) {
        this.searchables = searchables;
    }

    /**
     * Perform a Search against all set Searchables.
     *
     * @param query Search string.
     * @return A combined List of search results from querying all Searchables. Sort order is implementation-specific.
     * @throws IOException if one of the Searchables throws an exception
     */
    abstract public List<String> search(String query) throws IOException;
}
