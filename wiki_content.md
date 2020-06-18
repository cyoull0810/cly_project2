## About this Template:
Uses AutoDevOps: NO - uses variation of it via .gitlab-ci.yaml
Integrations:
 - Jenkins: ready but not configured 
 - Jira: ready but not configured

## To to do to get going:

 - Run Pipeline to create staging and Prod environments
	 - This will get an error at DAST step to fix it
		 - Get the Staging URL from Staging created
		 - Set DAST_Website Variable on the project
		 - Rerun step
- Update the Readme.md to reflect your project scenario information

## Notes on Use:
Site uses the AutoDevOps base pipeline with some changes:
-   It uses includes (so I can show them in demos)
-   It uses variables (see table below)
-   Build and test includes are disabled and manually configured
-   This allows me to simulate the tests so they run faster (see variables below)

## Work in Progress:

The Thing I have not figured out yet is

1.  The DAST scan - how to make the environment website dynamic - right now the review stage (for branches) and the Staging stage (for master) both point to staging (cheating)
2. The other thing is that you have to run a pipeline and create the stating environment to know the URL the 1st time

## Highlights:

-   Has issue and MR templates
-   Basic Labels and Milestones in place
-   Basic boards in place
-   DAST scanning will return issues
-   Discussions must be resolved
-   Has the Jenkins file to set up Jenkins integration
-   Has an issue for design review
-   Has all the theming of FireFly ;) (greatest SiFi show ever made
	- yes you are free to debate me on this

# Areas: I am still thinking out / shortfalls
   Not a lot of history for analytics or burndowns
-   only 1 basic page with Wiki so far
-   Nothing with packages or releases
-   Nothing for feature flags
-   Need to set up a whole thing for Safe and Generic PPM

## Does not come over with the template
I set these on site creation:
-   Approval rules
-   Project variables (why I set all but one in the yml or at the group level)
-   Jenkins Config
-   Jira Config
-   Error Tracking with Sentry


## Current Variables configuration
currently using variables directly in the yaml but they can be commented out and set at the project and group level

**Set at**|**Key**|**Value**
:-----:|:-----:|:-----:
yaml|CODE\_QUALITY\_DISABLED|true
yaml|CONTAINER\_SCANNING\_DISABLED|true
yaml|DAST\_DISABLED| Not used 
yaml|DEPENDENCY\_SCANNING\_DISABLED|true
yaml|INCREMENTAL\_ROLLOUT\_ENABLED|true
yaml|LICENSE\_MANAGEMENT\_DISABLED|true
yaml|PERFORMANCE\_DISABLED|true
yaml|REVIEW\_DISABLED| Not used
yaml|SAST\_DISABLED|true
yaml|STAGING\_ENABLED|true
yaml|TESTING\_DISABLED|true
project|DAST\_WEBSITE|Set to url of 1st build of staging. Or calculate it - The staging URL is built by the https://[Groupname]-[subgroupname]-[sitename]-staging.us-inst.gitlabdemo.io
