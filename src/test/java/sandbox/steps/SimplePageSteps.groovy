package sandbox.steps

import static org.junit.Assert.*
import static cucumber.api.groovy.EN.*
import static cucumber.api.groovy.Hooks.After
import static cucumber.api.groovy.Hooks.Before

import org.openqa.selenium.WebDriver
import org.openqa.selenium.firefox.FirefoxDriver
import org.openqa.selenium.By

WebDriver driver

Before { 
    driver = new FirefoxDriver()
}

After {
    driver.close()
}

Given(~'^I am on the google home page$') { ->
    driver.get("http://www.google.com")
}

When(~'I click I am feeling lucky') { ->
    //driver.findElement(By.id("gbqfbb")).click();
    driver.findElement(By.xpath('//button/span[contains(text(), "Feeling Lucky") ]')).click()
}

Then(~'I should see doodles') { ->
    assertEquals("Doodles", driver.findElement(By.cssSelector("h1")).getText())
}