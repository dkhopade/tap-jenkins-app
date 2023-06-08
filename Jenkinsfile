#!/bin/env groovy

pipeline {
  agent {
  // Use an agent that is appropriate
  // for your Jenkins installation.
  // This is only an example
    kubernetes {
        label 'slave'
    }
  }

  tools {
    maven 'maven3.9.2'
  }

  stages {
    stage('Checkout code') {
      steps {
        script {
          sourceUrl = params.SOURCE_REVISION
          indexSlash = sourceUrl.indexOf("/")
          revision = sourceUrl.substring(indexSlash + 1)
        }
        sh "rm -fr ./target"
        sh "git clone ${params.GIT_URL} target"
        dir("target") {
          sh "git checkout ${revision}"
        }
      }
    }

    stage('Maven test') {
      steps {
        container('jnlp') {
          dir("target") {
            // Example tests with maven
            sh "mvn clean test --no-transfer-progress"
          }
        }
      }
    }
  }
}