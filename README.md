# Java-MongoDB-Sample
A simple Java web application which communicates with MongoDB. Useful for testing Eclipse Che Java workspace.

# MongoDB
The application connects to the Mongo data base, so it should be configured with next parameters:
- MongoDB user - <b>user</b>
- MongoDB password - <b>password</b>
- The name of data base - <b>guestbook</b>

# Deploy the application on Kubernetes cluster by kubectl command-line tool
- Before you begin you need to have a Kubernetes cluster, and the `kubectl` command-line tool must be configured to communicate with your cluster. If you do not already have a cluster, you can create one by using `Minikube` or `Minishift`. To deploy the application use `kubectl apply -f ./kubernetes-manifests/<deployment_file>` command.

#  Deploy the application via Openshift Connector plug-in on Minishift
- Create and start a workspace from Java MongoDB Web Application stack with OpenShift Connector plug-in
- Open a terminal from `vscode-openshift-connector` container
- Login into your Kubernetes cluster via `oc login https://<IP>:<PORT> --certificate-authority=/var/run/secrets/kubernetes.io/serviceaccount/ca.crt` command
- Create a new project in <b>Openshift application explorer</b>
- Create new application in your project in <b>Openshift application explorer</b>
- Open `kubernetes-manifests/mongo.deployment.yaml` and deploy it via `Kubernetes: Create` command
- Create a new Openshift component and deploy backend module.
- Create a new Openshift component and deploy frontend module.