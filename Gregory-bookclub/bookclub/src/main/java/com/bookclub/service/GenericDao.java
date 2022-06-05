// This code was written as part of the bookclub application project
// to fulfill the requirements of CIS530 at Bellevue University
// Kylie Gregory - 5/22/2022

package com.bookclub.service;

import java.util.List;

public interface GenericDao<E, K> {
    List<E> list(K key); // Return a list of objects of type E.
    E find(K key); // Return an object of type E by type K value.
}
