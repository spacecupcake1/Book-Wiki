package com.project.kathai;

import java.util.Locale;

import org.springframework.context.annotation.Primary;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.View;
import org.springframework.web.servlet.ViewResolver;

@Component
@Primary
public class ThymeleafViewResolver implements ViewResolver {

	@Override
	@Nullable
	public View resolveViewName(String viewName, Locale locale) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}
    // Implementation...
}
