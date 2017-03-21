package com.jgw.junit.categories;

import org.junit.experimental.categories.Categories;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 * Created by kdeveloper on 03.02.17.
 */
@RunWith(Categories.class)
@Categories.IncludeCategory(FastTests.class)
@Suite.SuiteClasses({CategorizedTests.class, CatogorizedSecondTests.class})
public class FastTestsTestSuite {
}
