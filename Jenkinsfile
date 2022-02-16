pipeline {
    agent any

    tools {
        // Install the Maven version configured as "M3" and add it to the path.
        maven "maven-3.8.4"
    }

    stages {
        stage('Initialize'){
            steps{
                    echo "PATH = ${M2_HOME}/bin:${PATH}"
                    echo "M2_HOME = /opt/maven"
            }
        }
        stage('Test') {
            steps {
                sh 'mvn test'
            }
        }


        stage('Build') {
            steps {
                // Get some code from a GitHub repository
               // git 'https://github.com/raffaa10/calculatrice-tests-jenkins'

                // Run Maven on a Unix agent.
                sh "mvn -Dmaven.test.failure.ignore=true clean package"

                // To run Maven on a Windows agent, use
                // bat "mvn -Dmaven.test.failure.ignore=true clean package"
            }


            post {
                // If Maven was able to run the tests, even if some of the test
                // failed, record the test results and archive the jar file.
                success {
                    junit '**/target/surefire-reports/TEST-*.xml'
                    archiveArtifacts 'target/*.jar'
                }
            }
        }
        stage('SonarQube Analysis') {
            steps {
                sh 'mvn clean verify sonar:sonar \
                    -Dsonar.projectKey=tests \
                    -Dsonar.host.url=http://127.0.0.1:9000 \
                    -Dsonar.login=3386cac6bc8769eeae86ba9fd2e15890dbbcf115'
            }
        }

    }
}
