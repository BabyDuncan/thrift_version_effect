#!/bin/bash
thrift --gen java -out ../java model.thrift
thrift --gen java -out ../java service.thrift