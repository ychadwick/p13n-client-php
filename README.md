boxalino Personalization client for PHP
=======================================

Overview
--------

This library provides access to various functions of the boxalino Personalization.

Usage
-----

To use the Personalization client in your PHP project, take the following steps:

#1) Copy the contents of lib into your PHP codebase
#2) Configure your autoloader for Thrift or use the one provided:

require_once 'lib/Thrift/ClassLoader/ThriftClassLoader.php';
$loader = new \Thrift\ClassLoader\ThriftClassLoader(false);
$loader->registerNamespace('Thrift', 'lib/Thrift');
$loader->register();

#3) After that, you have to include the client to use it:

require_once 'lib/com/boxalino/p13n/api/thrift/P13nService.php';
require_once 'lib/com/boxalino/p13n/api/thrift/Types.php';

There is also an example provided in the example folder and an API documentation
in the doc folder.
