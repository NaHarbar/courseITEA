package homework.eighth;

public class HomeWork {
    //Code tab
    String repositoryName = "//strong[@itemprop='name']/a";
    String masterBranchSwitcher = "//summary/span[text()='master']";
    String protectBranchButton = "//a[text()='Protect this branch']";
    String editIcon = "//*[@aria-label='Edit repository metadata']";
    String pinButton = "//button[contains(@title, 'Pin')]";
    String dismissButton = "//span[text()='Dismiss']";
    String publicLabel = "//span[text()='Public']";
    String addReadmeButton = "//a[contains(text(),'README')]";
    String srcFolder = "//a[@title='src']";
/*   String codeTab = By.id("code-tab");
   String viewUserCommits = By.className("commit-author user-mention");
   String createNewRelease = By.linkText("Create a new release");*/

    //Actions tab
    String searchWorkflows = "//input[@name='query']";
    String viewAllDeploymentSection = "//h2[text()='Deployment']/parent::div//div[text()='View all']";
    String requestButton = "//a[text()='Request']";
    String setUpWorkflowButton = "//a[contains(text(),'set up a workflow yourself')]";
    String configureButtonForJavaWithGradle = "//h4[text()='Java with Gradle']//parent::div/parent::div/parent::div//a[text()='Configure'][1]";
    String idTab = "//a[@id='actions-tab']";
    String categorySecurity = "//a[contains(@href, 'category') and contains(text(), 'Security')]";
    String hideNoticeButton = "//*[@aria-label='Hide this notice forever']/parent::button";

}
