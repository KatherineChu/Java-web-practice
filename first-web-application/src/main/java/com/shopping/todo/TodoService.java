package com.shopping.todo;

import java.util.ArrayList;
import java.util.List;

public class TodoService {
	private static List<Todo> todos = new ArrayList<Todo>();
	static {
		todos.add(new Todo("Airpods", "electronic"));
		todos.add(new Todo("Airpods Pro", "electronic"));
		todos.add(new Todo("MacBook Pro", "electronic"));
		todos.add(new Todo("Airtag", "electronic"));
		todos.add(new Todo("Pink dress", "clothing"));
		todos.add(new Todo("Pants", "clothing"));
		todos.add(new Todo("Apple", "Food"));
		todos.add(new Todo("Banana", "Food"));
		todos.add(new Todo("Watermelon", "Food"));
		todos.add(new Todo("Fast food", "Food"));
		todos.add(new Todo("Pencil", "Daily"));
		todos.add(new Todo("Tissue paper", "Daily"));
		todos.add(new Todo("Bottle water", "Daily"));
		todos.add(new Todo("Masks", "Daily"));
	}

	public List<Todo> retrieveTodos() {
		return todos;
	}

	public void addTodo(Todo todo) {
		todos.add(todo);
	}

	public void deleteTodo(Todo todo) {
		todos.remove(todo);
	}

}