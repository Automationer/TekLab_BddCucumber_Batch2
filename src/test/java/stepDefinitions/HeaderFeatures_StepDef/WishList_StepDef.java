package stepDefinitions.HeaderFeatures_StepDef;

import com.thegreatcourses.pageObjects.HeaderPageObjects.WishListPage;
import com.thegreatcourses.utility.Commons;
import com.thegreatcourses.utility.components.WebButton;
import cucumber.api.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.stream.IntStream;

public class WishList_StepDef {

    private Commons commons = new Commons();
    private WishListPage wishListPage = new WishListPage();
    private WebButton clickAt = new WebButton();
    @Then("^Wish list should open$")
    public void wish_list_should_open() {
        commons.verifyWithTitle("Wishlist");
    }

    @Then("^Left navigation wish list tabs should display correct pages$")
    public void left_navigation_wish_list_tabs_should_display_correct_pages() {
        IntStream.range(0, 6).forEachOrdered(i -> {
            clickAt.$(commons.findBy(wishListPage.getLeftNavBar()).findElements(By.tagName("li")).get(i));
            WebElement header = commons.findBy(wishListPage.getHeader());
            commons.verifyHeader(wishListPage.getHeaderMessages().get(i), header);
        });

    }

}
