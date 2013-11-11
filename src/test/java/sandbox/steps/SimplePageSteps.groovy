package sandbox.steps

import static cucumber.api.groovy.EN.*
import static cucumber.api.groovy.Hooks.After
import static cucumber.api.groovy.Hooks.Before
import static org.junit.Assert.*

import org.openqa.selenium.By
import org.openqa.selenium.WebDriver
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver

WebDriver driver

Before { 
    driver = new HtmlUnitDriver() //new FirefoxDriver()
}

After {
    driver.close()
}

Given(~'^I am on the wikipedia home page$') { ->
    driver.get("http://en.wikipedia.org/wiki/Main_Page")
}

When(~'^I search for "algorithms"$') { ->
    driver.findElement(By.id("searchInput")).sendKeys("algorithms");
    driver.findElement(By.cssSelector("#searchButton")).click();
}

Then(~'^I should see the title Algorithms and the heading Algorithms$') { ->
    assertEquals("Algorithm - Wikipedia, the free encyclopedia", driver.getTitle());
    assertEquals("Algorithm", driver.findElement(By.cssSelector("span")).getText());
}

When(~'^I search for "wotif"$') { ->
    driver.findElement(By.id("searchInput")).sendKeys("wotif");
    driver.findElement(By.cssSelector("#searchButton")).click();
}

Then(~'^I should see the title Wotif.com and the heading Wotif.com$') { ->
    assertEquals("Wotif.com - Wikipedia, the free encyclopedia", driver.getTitle());
    assertEquals("Wotif.com", driver.findElement(By.cssSelector("span")).getText());
}


