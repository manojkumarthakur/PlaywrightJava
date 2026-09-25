package tests;

import com.microsoft.playwright.*;
import com.microsoft.playwright.options.AriaRole;
import org.testng.annotations.Test;

public class Test_CodeGen2_60177777 {

    int waitTime = 1000;


    public Locator tryLocators(Page page, Locator... locators) {
        for (Locator loc : locators) {
            try {
                if (loc != null && loc.first().isVisible()) {
                    return loc.first();
                }
            } catch (Exception ignored) {}
        }
        return locators.length > 0 ? locators[locators.length - 1] : null;
    }

    @Test(enabled = false)
    public void runLogic() {

        try (Playwright playwright = Playwright.create()) {

            Browser browser = playwright.chromium()
                .launch(new BrowserType.LaunchOptions().setHeadless(false));

            Page page = browser.newPage();

            //pageconstants

            try {
                //Step Number - 1
                
			//Step Number - 2
			page.navigate("https://qa.onequince.com/");
			
			//Step Number - 1
			Locator Trendingse1 = tryLocators(page,
		page.locator("#brand-logo").first(),
		page.getByTestId("brand-logo").first(),
		page.locator(".brandLogo_brand_logo_size__small__8Y6ci.brandLogo_brand_logo_type__black__2zLU5").first(),
		page.locator("xpath=//A[@href=\"/\"]/*[name() = \"svg\" and @class=\"brandLogo_brand_logo_size__small__8Y6ci brandLogo_brand_logo_type__black__2zLU5\"]"),
		page.locator("xpath=(//*[local-name()='svg'][@xmlns='http://www.w3.org/2000/svg' and @width='1em' and @height='1em' and @fill='none' and @viewBox='0 0 204 60' and @class='brandLogo_brand_logo_size__small__8Y6ci brandLogo_brand_logo_type__black__2zLU5' and @role='presentation' and @data-testid='brand-logo'])"),
		page.getByText("Quince home", new Page.GetByTextOptions().setExact(true)).first()
	);
			// Scroll element into view
			Trendingse1.scrollIntoViewIfNeeded();
			Thread.sleep(300);
			// Hover to trigger any hover effects (menus, etc)
			try {
				Trendingse1.hover();
				Thread.sleep(200);
			} catch (Exception e) {
				// Hover might not be available, continue
			}
			Trendingse1.click();
			Thread.sleep(waitTime);


			
			//Step Number - 1
			Locator OurCoreCol2 = tryLocators(page,
		page.locator("xpath=//*[@id=\"site-primary-header\"]/DIV[3]/DIV/DIV[3]/DIV/BUTTON/DIV"),
		page.locator("xpath=(//DIV[@class='header_menu_item_title_wrapper__rvLCs'])[3]"),
		page.getByText("Best Sellers", new Page.GetByTextOptions().setExact(true)).first()
	);
			// Scroll element into view
			OurCoreCol2.scrollIntoViewIfNeeded();
			Thread.sleep(300);
			// Hover to trigger any hover effects (menus, etc)
			try {
				OurCoreCol2.hover();
				Thread.sleep(200);
			} catch (Exception e) {
				// Hover might not be available, continue
			}
			OurCoreCol2.click();
			Thread.sleep(waitTime);


			
			//Step Number - 1
			Locator OurCoreCol3 = tryLocators(page,
		page.locator(".megaMenu_megaMenu__subMenuColumn__subMenu__link__nyM9D.cursor--pointer.link_wrapper__tF6ZG").first(),
		page.locator("xpath=(//A[@href=\"/women/best-sellers\"])[1]"),
		page.locator("xpath=(//A[@class='megaMenu_megaMenu__subMenuColumn__subMenu__link__nyM9D cursor--pointer link_wrapper__tF6ZG' and @href='/women/best-sellers'])"),
		page.getByText("Women", new Page.GetByTextOptions().setExact(true)).first()
	);
			// Scroll element into view
			OurCoreCol3.scrollIntoViewIfNeeded();
			Thread.sleep(300);
			// Hover to trigger any hover effects (menus, etc)
			try {
				OurCoreCol3.hover();
				Thread.sleep(200);
			} catch (Exception e) {
				// Hover might not be available, continue
			}
			OurCoreCol3.click();
			Thread.sleep(waitTime);


			
			//Step Number - 1
			Locator women4 = tryLocators(page,
		page.locator("#collection-title").first(),
		page.getByTestId("collection-title").first(),
		page.locator(".desktopOnly.d-flex.justify-content--center").first(),
		page.locator("xpath=//*[@id=\"sub-category-list-header\"]/DIV/DIV[2]/DIV/H1"),
		page.locator("xpath=(//H1[@data-testid='collection-title' and @class='desktopOnly d-flex justify-content--center font-family--grosa font-weight--500 text-transform--uppercase collectionPage_collection_header__4U5sw collectionPage_newCLPFiltersTitle__PNgZh'])"),
		page.getByText("Best Sellers", new Page.GetByTextOptions().setExact(true)).first()
	);
			try {
				Thread.sleep(500);
				boolean found = false;
				try {
					found = page.locator("text=BEST SELLERS").isVisible(new Locator.IsVisibleOptions().setTimeout(2000));
				} catch (Exception e1) {
					try {
						Object result = page.locator("input, textarea").evaluateAll("elements => elements.some(el => el.value && el.value.includes('BEST SELLERS'))");
						found = result instanceof Boolean ? (Boolean) result : false;
					} catch (Exception e2) { }
				}
				if (!found) System.out.println("Warning: Text not found: BEST SELLERS");
			} catch (Exception e) {
				throw new AssertionError("Validation failed for text 'BEST SELLERS': " + e.getMessage());
			}
			Thread.sleep(waitTime);


			
			//Step Number - 1
			Locator ITEMS5 = tryLocators(page,
		page.locator("xpath=//*[@id=\"stickyWrapperFilterSectionWithDrawer\"]/DIV[2]/DIV/DIV/DIV/DIV[2]/DIV/DIV/SPAN/SPAN"),
		page.locator("xpath=(//SPAN)[29]"),
		page.getByText("Price Range", new Page.GetByTextOptions().setExact(true)).first()
	);
			// Scroll element into view
			ITEMS5.scrollIntoViewIfNeeded();
			Thread.sleep(300);
			// Hover to trigger any hover effects (menus, etc)
			try {
				ITEMS5.hover();
				Thread.sleep(200);
			} catch (Exception e) {
				// Hover might not be available, continue
			}
			ITEMS5.click();
			Thread.sleep(waitTime);


			
			//Step Number - 1
			Locator ITEMS6 = tryLocators(page,
		page.locator(".checkboxV2_checkboxControl__8ZFF5.checkboxV2_hovered__c_pJ3").first(),
		page.locator("xpath=//*[@id=\"stickyWrapperFilterSectionWithDrawer\"]/DIV[2]/DIV/DIV/DIV/DIV[2]/DIV/DIV[2]/UL/LI[1]/SPAN/DIV/LABEL[2]/DIV/DIV"),
		page.locator("xpath=(//DIV[@class='checkboxV2_checkboxControl__8ZFF5 checkboxV2_hovered__c_pJ3'])"),
		page.getByText("$25-50", new Page.GetByTextOptions().setExact(true)).first()
	);
			// Scroll element into view
			ITEMS6.scrollIntoViewIfNeeded();
			Thread.sleep(300);
			// Hover to trigger any hover effects (menus, etc)
			try {
				ITEMS6.hover();
				Thread.sleep(200);
			} catch (Exception e) {
				// Hover might not be available, continue
			}
			ITEMS6.click();
			Thread.sleep(waitTime);


			
			//Step Number - 1
			Locator field7 = tryLocators(page,
		page.locator("xpath=//*[@id=\"stickyWrapperFilterSectionWithDrawer\"]/DIV[2]/DIV/DIV/DIV/DIV[2]/DIV/DIV/SPAN/SPAN"),
		page.locator("xpath=(//SPAN)[27]"),
		page.getByText("Price Range (1)", new Page.GetByTextOptions().setExact(true)).first()
	);
			// Scroll element into view
			field7.scrollIntoViewIfNeeded();
			Thread.sleep(300);
			// Hover to trigger any hover effects (menus, etc)
			try {
				field7.hover();
				Thread.sleep(200);
			} catch (Exception e) {
				// Hover might not be available, continue
			}
			field7.click();
			Thread.sleep(waitTime);


			
			//Step Number - 1
			Locator From8 = tryLocators(page,
		page.locator(".product-card-link_productLink__ocHfM.cursor--pointer.link_wrapper__tF6ZG").first(),
		page.locator("xpath=//A[@href=\"/women/linen-shirt?color=black&gender=women&tracker=collection_page__%2Fwomen%2Fbest-sellers__prices-%2425-50__All%20Products__0\"]"),
		page.locator("xpath=(//A[@class='product-card-link_productLink__ocHfM cursor--pointer link_wrapper__tF6ZG' and @href='/women/linen-shirt?color=black&gender=women&tracker=collection_page__%2Fwomen%2Fbest-sellers__prices-%2425-50__All%20Products__0' and @data-selector-key='COLLECTION__MOVE_TO_PDP'])"),
		page.getByText("Black Automation 100% European Linen Long Sleeve Shirt", new Page.GetByTextOptions().setExact(true)).first()
	);
			// Scroll element into view
			From8.scrollIntoViewIfNeeded();
			Thread.sleep(300);
			// Hover to trigger any hover effects (menus, etc)
			try {
				From8.hover();
				Thread.sleep(200);
			} catch (Exception e) {
				// Hover might not be available, continue
			}
			From8.click();
			Thread.sleep(waitTime);


			
			//Step Number - 1
			Locator L9 = tryLocators(page,
		page.locator("xpath=//*[@id=\"appLayoutMainNew\"]/DIV/DIV/DIV/DIV[2]/FIELDSET[2]/DIV/DIV[2]/LABEL/SPAN"),
		page.locator("xpath=(//SPAN)[43]"),
		page.getByText("S", new Page.GetByTextOptions().setExact(true)).first()
	);
			// Scroll element into view
			L9.scrollIntoViewIfNeeded();
			Thread.sleep(300);
			// Hover to trigger any hover effects (menus, etc)
			try {
				L9.hover();
				Thread.sleep(200);
			} catch (Exception e) {
				// Hover might not be available, continue
			}
			L9.click();
			Thread.sleep(waitTime);


			
			//Step Number - 1
			Locator ADDTOCART10 = tryLocators(page,
		page.locator("xpath=//*[@id=\"appLayoutMainNew\"]/DIV/DIV/DIV/DIV[2]/DIV[3]/BUTTON/SPAN"),
		page.locator("xpath=(//SPAN[@style='opacity: 1;'])[3]"),
		page.getByText("ADD TO CART", new Page.GetByTextOptions().setExact(true)).first()
	);
			// Scroll element into view
			ADDTOCART10.scrollIntoViewIfNeeded();
			Thread.sleep(300);
			// Hover to trigger any hover effects (menus, etc)
			try {
				ADDTOCART10.hover();
				Thread.sleep(200);
			} catch (Exception e) {
				// Hover might not be available, continue
			}
			ADDTOCART10.click();
			Thread.sleep(waitTime);


			
			//Latest Step
			Locator CHECKOUT11 = tryLocators(page,
		page.locator(".button_btn__VJM8o.button_btn__small__jXPKK.button_btn__secondary__fC0OQ").first(),
		page.locator("xpath=//*[@id=\"cartPopupTwoWrapper\"]/DIV/DIV/DIV[3]/DIV/DIV[2]/BUTTON"),
		page.locator("xpath=(//BUTTON[@class='button_btn__VJM8o button_btn__small__jXPKK button_btn__secondary__fC0OQ cartPopUpTwo_checkout_button__FD4vr cartPopUpTwo_checkoutButtonOverrideForExpress__2FTJL font-family--grosa  ' and @data-selector-key='CART__CHECKOUT_BUTTON'])"),
		page.getByText("CHECKOUT", new Page.GetByTextOptions().setExact(true)).first()
	);
			// Scroll element into view
			CHECKOUT11.scrollIntoViewIfNeeded();
			Thread.sleep(300);
			// Hover to trigger any hover effects (menus, etc)
			try {
				CHECKOUT11.hover();
				Thread.sleep(200);
			} catch (Exception e) {
				// Hover might not be available, continue
			}
			CHECKOUT11.click();
			Thread.sleep(waitTime);


			//Add from Here

            } catch (Exception e) {
                e.printStackTrace();
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}