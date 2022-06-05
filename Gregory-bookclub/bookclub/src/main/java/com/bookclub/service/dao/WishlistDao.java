// This code was written as part of the bookclub application project
// to fulfill the requirements of CIS530 at Bellevue University
// Kylie Gregory - 5/22/2022

package com.bookclub.service.dao;

import com.bookclub.model.WishlistItem;
import com.bookclub.service.GenericCrudDao;
import com.bookclub.service.GenericDao;

public interface WishlistDao extends GenericCrudDao<WishlistItem, String> {
}
