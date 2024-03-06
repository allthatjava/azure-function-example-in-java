### Azure Function example
#### First install Azure Toolkit for Intellij
![img/azure_toolkit.png](img/azure_toolkit.png)


#### Create Azure Function project with the feature you want
![img/azure_function_project.png](img/azure_function_project.png)

#### To run the function locally
select the run button beside the method you are going to run
![img/azure_function_run.png](img/azure_function_run.png)

#### You can change port and stuff
By changing configuration on 
![img/azure_function_run_config.png](img/azure_function_run_config.png)

#### To deploy functions to Azure Cloud 
- First login to Azure Cloud account in Azure Explorer
Open up the 'Azure' on the project and click on Deploy to Azure...
![img/azure_function_deploy.png](img/azure_function_deploy.png)

#### Click on 'Run' 
![img/azure_function_deploy_config.png](img/azure_function_deploy_config.png)

- Then a few seconds later you will see the deployed functions under the Azure/Deployment Target/{your function on Azure}
![img/azure_function_deploy_config.png](img/azure_function_deployed.png)

#### Run the function that deployed on Cloud
Right click on the function you have deployed on Cloud then click on "Trigger Function in Browser"

![img/azure_functions_run_on_cloud.png](img/azure_functions_run_on_cloud.png)

#### Check the code on the browser
You can see the 'code' parameter has been added. It is from the 'App Key' menu on the Azure.
It needed to be provide for the security measure. If you run it from Intellij, it will be automatically attached.
However, if it needs to be called from other service, 'code' must be provided to call that function.

![img/azure_function_running_on_broswer.png](img/azure_function_running_on_broswer.png)

#### See the log on Azure Portal
You can see the log in the Resource Group - Logs tab. It seems like it has 4-5 min delay to show the log...
![img/azure_functions_log.png](img/azure_functions_log.png)