package com.jgw.categories;

import org.junit.experimental.categories.Categories;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 * Created by kdeveloper on 24.01.17.
 */
@RunWith(Categories.class)
@Categories.IncludeCategory(SlowTests.class)
@Suite.SuiteClasses({CategorizedTests.class, CatogorizedSecondTests.class})
public class SlowTestsTestSuite {
}
