package AssessmentPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.itextpdf.text.pdf.PdfStructTreeController.returnType;

import AssessmentBase.AssessmentTestBase;

public class HotelBookingConfirmationPage extends AssessmentTestBase {
	@FindBy(xpath="//h1[@align='center']")
	WebElement expected_success_msg;
	
	public HotelBookingConfirmationPage() {
		PageFactory.initElements(driver, this);
	}
	
	public String bookingConfirmation() {
		WebElement actual_success_msg = driver.findElement(By.xpath("//h1[@align='center']"));
		return actual_success_msg.getText();
		
	}

}

