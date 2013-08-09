
include "model.thrift"

namespace java com.babyduncan.thrift.service

service BookService {

    model.Book getBook(1:i64 id);

    i64 saveBook(1:model.Book book);

}
