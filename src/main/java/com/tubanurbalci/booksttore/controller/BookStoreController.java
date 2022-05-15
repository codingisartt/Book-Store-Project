package com.tubanurbalci.booksttore.controller;

import com.tubanurbalci.booksttore.dto.BookOrderRequest;
import com.tubanurbalci.booksttore.model.Book;
import com.tubanurbalci.booksttore.model.Order;
import com.tubanurbalci.booksttore.service.BookService;
import com.tubanurbalci.booksttore.service.OrderService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("v1/bookstore")
public class BookStoreController {

    private final OrderService orderService;
    private final BookService bookService;

    public BookStoreController(OrderService orderService, BookService bookService) {
        this.orderService = orderService;
        this.bookService = bookService;
    }

    @GetMapping("/books")
    public ResponseEntity<List<Book>> getAllBooks(){
        List<Book> bookList=bookService.getAllBooks();
        return ResponseEntity.ok(bookList);
    }

    @GetMapping("/orders")
    public ResponseEntity<List<Order>> getAllOrders(){

        List<Order> orderList=orderService.getAllOrders();
        return ResponseEntity.ok(orderList);
    }

    @PostMapping
    public ResponseEntity<Order> putAnOrder(@RequestBody BookOrderRequest bookOrderRequest){

        Order order=orderService.putAnOrder(bookOrderRequest.getBookIdList(),bookOrderRequest.getUserName());
        return ResponseEntity.ok(order);
    }
}
