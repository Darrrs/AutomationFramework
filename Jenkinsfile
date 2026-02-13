pipeline{
    agent any

    tools{
        jdk "JDK11"
        maven "Maven3"

    }

    stages{
        stage('Check out Code'){
            steps{
                git "https://github.com/Darrrs/AutomationFramework"
            }
        }
        stage('Build and Test'){
            steps{
                sh 'mvn clean test'
            }
        }
    }

    post{
        always{
             archiveArtifacts artifacts: '**/target/*.jar', allowEmptyArchive: true
            junit '**/target/surefire-reports/*.xml'
        }
        success{
            echo 'Build Success'
        }
        failure{
            echo 'Build Failed'
        }
    }
    
}