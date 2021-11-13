package com.rapl.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.rapl.base.ReadConfigFile;
import com.rapl.base.Utility;

public class FeedbackPage extends ReadConfigFile  {
	
	WebDriver Driver;
	
	@FindBy(xpath = "//a[@app-translate = 'LEARNER.MANAGE']") 
	WebElement manageOption;
	
	@FindBy(xpath = "//body[1]/app-root[1]/ng-component[1]/main[1]/div[1]/app-admin-header[1]/div[1]/mat-tab-group[1]/mat-tab-header[1]/div[3]/div[1]")
	WebElement navigationButton;
	
	@FindBy(xpath = "//a[contains(text(),'Manage Feedback')]") 
	WebElement manageFeedback;
	
	@FindBy(xpath = "//body/app-root[1]/ng-component[1]/main[1]/div[1]/app-manage-feedback[1]/nav[1]/ul[1]/li[2]/a[1]") 
	WebElement feedbackOption;
	
	@FindBy(xpath = "//mat-tab-body/div[1]/ng-datatable-x[1]/div[1]/nav[1]/div[1]/form[1]/div[1]/button[2]") 
	WebElement createFeedbackButton;
	
	@FindBy(xpath = "//body[1]/app-root[1]/ng-component[1]/main[1]/div[1]/app-manage-feedback[1]/app-feedback[1]/div[1]/div[1]/mat-tab-group[1]/div[1]/mat-tab-body[2]/div[1]/app-create-edit-feedback[1]/div[1]/mat-tab-group[1]/div[1]/mat-tab-body[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/nav[1]/div[1]/mat-form-field[1]/div[1]/div[1]/div[1]/input[1]")
	WebElement searchTemplateBox;
	
	@FindBy(xpath = "(//div[@class='folder-icon'])[1]")
	WebElement seriousFeedback;
	
	@FindBy(xpath = "//input[@name='name']") 
	WebElement nameTestBox;
	
	@FindBy(xpath = "//textarea[@name='description']")
	WebElement descriptionTextBox;
	
	@FindBy(xpath = "//input[@placeholder='Tags']") 
	WebElement tagsTextBox;
	
	@FindBy(xpath = "//mat-tab-body/div[1]/form[1]/div[1]/div[1]/div[1]/div[2]/div[3]/div[1]/div[1]/mat-checkbox[1]/label[1]/span[1]") 
	WebElement acknowledgementCheckBox;
	
	@FindBy(xpath = "//input[@data-placeholder='Due by days']")
	WebElement dueByDaysTextBox;
	
	@FindBy(xpath = "//button[contains(text(),'CREATE')]")
	WebElement createButton;
	
	@FindBy(xpath = "//body[1]/app-root[1]/ng-component[1]/main[1]/div[1]/app-manage-feedback[1]/app-feedback[1]/div[1]/div[1]/mat-tab-group[1]/div[1]/mat-tab-body[2]/div[1]/app-create-edit-feedback[1]/div[1]/mat-tab-group[1]/div[1]/mat-tab-body[2]/div[1]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[1]/label[1]/button[1]")
	WebElement selectGroupButton;
	
	@FindBy(xpath = "//input[@data-placeholder='Search Group']") 
	WebElement searchGroupTextBox;
	
	@FindBy(xpath = "//tbody/tr[1]/td[1]/div[1]/div[1]")
	WebElement selectGroupOption;
	
	@FindBy(xpath = "(//div[@class='custom-control custom-checkbox table-custom-checkbox'])[3]") 
	WebElement selectcheckBox;
	
	@FindBy(xpath = "//button[@class = 'btn btn-sm align-middle btn-outline-primary']") 
	WebElement includeGroupsButton;
	
	@FindBy(xpath = "//div/h5/button[@type='button']") 
	WebElement closeButton;
	
	@FindBy(xpath = "//body[1]/app-root[1]/ng-component[1]/main[1]/div[1]/app-admin-header[1]/div[1]/mat-tab-group[1]/mat-tab-header[1]/div[1]") 
	WebElement BackNavigationButton;
	
	@FindBy(xpath = "//a[contains(text(),'Manage Structure')]")
	WebElement manageStructureOption;
	
	@FindBy(xpath = "//body[1]/app-root[1]/ng-component[1]/main[1]/div[1]/app-manage-structure[1]/app-node-bundle-sidebar[1]/app-node[1]/div[1]/div[1]/nav[1]/div[1]/mat-form-field[1]/div[1]/div[1]/div[1]/input[1]") 
	WebElement manageStructureSearchGroupTextBox;
	
	@FindBy(xpath = "//tbody/tr[1]/td[1]/div[1]/div[1]")
	WebElement selectOptionButton;
	
	@FindBy(xpath = "//body[1]/app-root[1]/ng-component[1]/main[1]/div[1]/app-manage-structure[1]/app-node-bundle-sidebar[1]/app-node[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/mat-tab-group[1]/mat-tab-header[1]/div[3]")
	WebElement rightNavigationButton;
	
	@FindBy(xpath = "//body[1]/app-root[1]/ng-component[1]/main[1]/div[1]/app-manage-structure[1]/app-node-bundle-sidebar[1]/app-node[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/mat-tab-group[1]/mat-tab-header[1]/div[2]/div[1]/div[1]/div[10]")
	WebElement feedbackButton;

	@FindBy(xpath = "//tbody/tr[1]/td[6]/div[1]/div[1]/div[1]/button[1]/span[1]/span[1]")
	WebElement flutterOption;
	
	@FindBy(xpath = "//body[1]/div[3]/div[2]/div[1]/div[1]/div[1]/button[2]")
	WebElement feedbackPendingOption;
	
	@FindBy(xpath = "//tbody/tr[1]/td[7]/div[1]/button[1]/span[1]")
	WebElement actionButton;
	
	@FindBy(xpath = "(//span[@class = 'mat-radio-container'])[1]")
	WebElement firstAnswer;
	
	@FindBy(xpath = "//body[1]/ngb-modal-window[1]/div[1]/div[1]/app-feedback-question-modal[1]/div[2]/form[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/ul[1]/li[2]/div[1]/mat-checkbox[1]/label[1]/span[1]")
	WebElement secondAnswer;
	
	@FindBy(xpath = "//body[1]/ngb-modal-window[1]/div[1]/div[1]/app-feedback-question-modal[1]/div[2]/form[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/mat-form-field[1]/div[1]/div[1]/div[1]/input[1]")
	WebElement thirdAnswer;
	
	@FindBy(xpath = "//body[1]/ngb-modal-window[1]/div[1]/div[1]/app-feedback-question-modal[1]/div[2]/form[1]/div[1]/div[1]/div[1]/div[4]/div[1]/div[1]/div[1]/mat-form-field[1]/div[1]/div[1]/div[1]/textarea[1]")
	WebElement fourthAnswer;
	
	@FindBy(xpath = "//body[1]/ngb-modal-window[1]/div[1]/div[1]/app-feedback-question-modal[1]/div[2]/form[1]/div[1]/div[1]/div[1]/div[5]/div[1]/div[1]/div[1]/div[1]/div[1]/mat-form-field[1]/div[1]/div[1]/div[1]/input[1]")
	WebElement fifthAnswer;
	
	@FindBy(xpath = "//body[1]/ngb-modal-window[1]/div[1]/div[1]/app-feedback-question-modal[1]/div[2]/form[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/button[1]")
	WebElement submitFeedbackButton;
		
	@FindBy(xpath = "//img[@class = 'rounded-circle header-avatar']")
	WebElement myAccountButton;
	
	@FindBy(xpath = "(//img[@class ='nav-img me-2'])[3]")
	WebElement myFeedbackButton;
	
	
	public FeedbackPage(WebDriver Driver) {
		this.Driver = Driver;
		PageFactory.initElements(Driver, this);
	}
	
	public void feedbackMethod() throws InterruptedException {
		readConfig();
		
		Utility.waitFor(manageOption).click();
		Utility.waitFor(navigationButton).click();
		Utility.waitFor(navigationButton).click();
		Utility.waitFor(manageFeedback).click();
		Utility.waitFor(feedbackOption).click();
		Utility.waitFor(createFeedbackButton).click();
		Utility.waitFor(searchTemplateBox).click();
		Utility.waitFor(seriousFeedback).click();
		Utility.waitFor(nameTestBox).sendKeys(properties.getProperty("FeedbackName"));
		Utility.waitFor(descriptionTextBox).sendKeys(properties.getProperty("FeedbackDescription"));
		Utility.waitFor(tagsTextBox).sendKeys(properties.getProperty("FeedbackTags"));
		Utility.waitFor(acknowledgementCheckBox).click();
		Utility.waitFor(dueByDaysTextBox).sendKeys(properties.getProperty("FeedbackDueDate"));
		Utility.waitFor(createButton).click();
		Utility.waitFor(selectGroupButton).click();
		Utility.waitFor(searchGroupTextBox).sendKeys("praveen");
		Utility.waitFor(selectGroupOption).click();
		Utility.waitFor(selectcheckBox).click();
		Utility.waitFor(includeGroupsButton).click();
		Thread.sleep(5000);
		Utility.waitFor(closeButton).click();
		Utility.waitFor(BackNavigationButton).click();
		Utility.waitFor(BackNavigationButton).click();
		Utility.waitFor(manageStructureOption).click();	
		Thread.sleep(5000);
		Utility.waitFor(manageStructureSearchGroupTextBox).click();
		Utility.waitFor(manageStructureSearchGroupTextBox).sendKeys("praveen");
		Thread.sleep(5000);
		Utility.waitFor(selectOptionButton).click();
		Thread.sleep(5000);
		Utility.waitFor(rightNavigationButton).click();
		Utility.waitFor(rightNavigationButton).click();
		Utility.waitFor(rightNavigationButton).click();
		Utility.waitFor(feedbackButton).click();
		Utility.waitFor(flutterOption).click();
		Utility.waitFor(feedbackPendingOption).click();
		Utility.waitFor(actionButton).click();
		Utility.waitFor(firstAnswer).click();
		Thread.sleep(5000);
		Utility.waitFor(secondAnswer).click();	
		Thread.sleep(5000);
		Utility.waitFor(thirdAnswer).sendKeys("Text Entered");
		Thread.sleep(5000);
		Utility.waitFor(fourthAnswer).sendKeys("Text Entered");
		Thread.sleep(5000);
		Utility.waitFor(fifthAnswer).sendKeys("Text");
		Thread.sleep(5000);
		Utility.waitFor(submitFeedbackButton).click();	
		Thread.sleep(10000);
		Utility.waitFor(myAccountButton).click();
		Thread.sleep(5000);
		Utility.waitFor(myFeedbackButton).click();
		Thread.sleep(5000);
	}
	
}