# jenkins-shared-library
# Jenkins Shared Library

This shared library provides reusable pipeline logic for Jenkinsfiles.

## Usage

In your Jenkinsfile:

```groovy
@Library('shared-lib') _

pipeline {
    agent any
    stages {
        stage('Common Build') {
            steps {
                script {
                    commonBuild(env: 'dev')
                }
            }
        }
    }
}
