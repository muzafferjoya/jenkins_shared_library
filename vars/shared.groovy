@Library("shared-library@master") _
pipeline {
	agent any
	environment{
		JIRA_URL = "https://eroam.atlassian.net"
		JIRA_CREENTIALS = credentials('jenkins-jira')
	}
	stages {
		stage('create issue'){
		  steps{
		    jiraCreateIssue(key: "ES", summary: "Issue created from Jenkins", description: "This is the desc for the issue created from jenkins", issueTypeName: "Story")
		  }
		}
	}

}
