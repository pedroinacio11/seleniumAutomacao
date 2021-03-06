package FirefoxBrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import Util.GeraCPF;

public class LaunchApplicationFirefox {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", "C:\\Desenvolvimento\\Selenium\\DriverFirefox\\geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://srv2012r2-19/CertiMedManager/gestor/public/cadastro#/novo-pro-hsm");
		
		GeraCPF CPF = new GeraCPF();
		
		WebElement cpf = driver.findElement(By.id("cpf"));
		cpf.sendKeys(CPF.generate());
		
		// Inicializar nome
		WebElement nameVazio = driver.findElement(By.id("nome"));
		nameVazio.sendKeys("");
		
		WebElement name = driver.findElement(By.id("nome"));
		name.sendKeys("PEDRO HENRIQUE FRANCISCO INACIO");
		
		WebElement email = driver.findElement(By.id("email"));
		email.sendKeys("pedro.inacio@teste.com.br");
		
		WebElement dataNascimento = driver.findElement(By.id("dataNascimento"));
		dataNascimento.sendKeys("11111991");
		
		WebElement rg = driver.findElement(By.id("rg"));
		rg.sendKeys("481144663");
		
		WebElement rgOrgaoExp = driver.findElement(By.id("rgOrgaoExpedidor"));
		rgOrgaoExp.sendKeys("SSP");
		
		WebElement rgUf = driver.findElement(By.id("rgUf"));
		rgUf.sendKeys("SP");
		
		WebElement telefone = driver.findElement(By.id("telefone"));
		telefone.sendKeys("1145012442");
		
		WebElement especialidade = driver.findElement(By.id("especialidade"));
		especialidade.sendKeys("CLINICO GERAL");
		
		WebElement senha = driver.findElement(By.id("senha"));
		senha.sendKeys("1234");
		
		WebElement confirmacao = driver.findElement(By.id("confirmacao"));
		confirmacao.sendKeys("1234");
		
		WebElement botaoAutenticar = driver.findElement(By.className("btn-solicitar-certificado"));
		botaoAutenticar.click();
		
	}	
	
}
