package com.nelioalves.cursomc.resources.util;

import java.net.URI;

import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

public class ResourceUtil {

	public static URI getUri(String path, Integer id) {
		return ServletUriComponentsBuilder.fromCurrentRequest().path(path).buildAndExpand(id).toUri();
	}
}