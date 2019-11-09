# Javatopia

## This is an API Wrapper for the Utopia P2P ecosystem in the Java language.

## Usage
1. Clone the repository.
2. Save the WebAPIWrapper.java class into your project directory
3. Create a new class and call the WebAPIWrapper class as an Object
  
<code>WebAPIWrapper uapi = new WebAPIWrapper("//API KEY HERE");</code>  
<code>//call the any utopia API method using uapi.method_here("parameters");</code>

> Example's:  
<code>uapi.getSystemInfo();</code>  
<code>uapi.setProfileStatus("available", "happy");</code>

> Note:  
The wrapper class is an example class of how you would access the API.  
The WebAPIWrapper class contains the API wrapper.
