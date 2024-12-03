package com.xworkz.task.configuration;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;



@Component
@ComponentScan("com.xworkz")

public class TaskConfiguration {
	public TaskConfiguration() {
		System.out.println("TaskConfiguration constructor");
	}
	@Bean
	public List getArraylist() {
		System.out.println("array list method");
		return new ArrayList();
	}
	@Bean
	public LinkedList getLinkedList() {
		System.out.println("linked list method");
		return new LinkedList();
	}
	@Bean
	public Set getHashSet() {
		System.out.println("hash set method");
		return new HashSet();
	}
	@Bean
	public LinkedHashSet getLinkedHashSet() {
		System.out.println("LinkedHashSet method");
		return new LinkedHashSet();
	}
	@Bean
	public Iterable getIterable() {
		System.out.println("Iterable method");
		return new LinkedHashSet();
	}
	@Bean
	public Collection getCollection() {
		System.out.println("collection method");
		return new LinkedHashSet();
	}
	@Bean
	public TreeSet getTreeSet() {
		System.out.println("TreeSet method");
		return new TreeSet();
	}
	@Bean
	public Queue getQueue() {
		System.out.println("Queue method");
		return new PriorityQueue();
	}
	@Bean
	public PriorityQueue getPriorityQueue() {
		System.out.println("PriorityQueue method");
		return new PriorityQueue();
	}
	@Bean
	public Map getMap() {
		System.out.println("Map method");
		return new HashMap();
	}
	@Bean
	public LinkedHashMap getLinkedHashMap() {
		System.out.println("Map method");
		return new LinkedHashMap();
	}

}
