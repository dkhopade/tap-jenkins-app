### This is optional and only required if you have not used namespace provisioner (that should do it for you)
Run this command to patch SA inside your developer namespace where the tekton pipeline is located.

https://docs.vmware.com/en/VMware-Tanzu-Application-Platform/1.5/tap/scc-ootb-supply-chain-testing-with-jenkins.html
```kubectl patch serviceaccount default \
  --patch '{"imagePullSecrets": [{"name": "tap-registry"}]}' \
  --namespace developer-namespace```