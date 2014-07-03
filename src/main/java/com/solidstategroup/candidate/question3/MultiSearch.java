package com.solidstategroup.candidate.question3;

import java.io.IOException;
import java.util.List;

/**
 * Abstract base class for combining the results of multiple {@link Search} objects.
 */
public abstract class MultiSearch implements Search {

    private List<Search> searches = null;

    /**
     * @return the Searches set on this MultiSearch.
     */
    public List<Search> getSearches() {
        return searches;
    }

    /**
     * Sets the Search objects to be called for a MultiSearch.
     *
     * @param searches All {@link Search} implementations to be called for a search.
     */
    public void setSearches(List<Search> searches) {
        this.searches = searches;
    }

    /**
     * Perform an multi Search against all set Searches, and returned the aggregated result set.
     *
     * @param query Search string.
     * @return A combined List of search results from querying all Searches. Sort order is implementation-specific.
     * @throws IOException if one of the Searches throws an exception
     */
    abstract public List<String> search(String query) throws IOException;
}
