pipeline {
  agent any
  triggers {
    pollSCM('*/5 * * * *')
  }
  stages{
       stage ('Build'){
        steps {
          sh 'mvn clean package'
        }
         post {
           success {
             echo 'Archiving...'
             archiveArtifacts artifacts:'**/target/*.war'
           }
         }
       }
       stage ('Deployments') {
         parallel{
           stage ('Deploy to Staging'){
             steps {
               sh "cp **/target/*.war /Users/C5320729/Documents/tomcat/webapps"
             }
           }
           /*stage ('Deploy to prod') {
             steps {
               sh "cp **/target/*.war /home/ivan/programms/tomcat-prod/webapps"
             }     
           }*/
         }
       }
    }
} 
  
