-- Basic information
INSERT INTO basic_information (id, display_name, full_name, display_title)
VALUES (1, 'Oscar Camacho',
'Oscar Uriel Camacho Hernandez', 'Lead Software Engineer');

-- Skills
INSERT INTO skill (display_name, years_of_experience, proficiency, category)
VALUES ('Java', 5.5, 'Advanced', 'Programing Languages');
INSERT INTO skill (display_name, years_of_experience, proficiency, category)
VALUES ('Spring MVC', 3, 'Intermediate', 'Frameworks');
INSERT INTO skill (display_name, years_of_experience, proficiency, category)
VALUES ('Spring Boot', 3, 'Intermediate', 'Frameworks');
INSERT INTO skill (display_name, years_of_experience, proficiency, category)
VALUES ('Hibernate', 3, 'Intermediate', 'Frameworks');
INSERT INTO skill (display_name, years_of_experience, proficiency, category)
VALUES ('Flowable', 2, 'Intermediate', 'Frameworks');
INSERT INTO skill (display_name, years_of_experience, proficiency, category)
VALUES ('Guice', 2, 'Intermediate', 'Frameworks');
INSERT INTO skill (display_name, years_of_experience, proficiency, category)
VALUES ('JUnit', 4, 'Advanced', 'Frameworks');
INSERT INTO skill (display_name, years_of_experience, proficiency, category)
VALUES ('JavaFX', 4, 'Intermediate', 'Frameworks');
INSERT INTO skill (display_name, years_of_experience, proficiency, category)
VALUES ('JavaScript', 5.5, 'Advanced', 'Programing Languages');
INSERT INTO skill (display_name, years_of_experience, proficiency, category)
VALUES ('TypeScript', 4, 'Advanced', 'Programing Languages');
INSERT INTO skill (display_name, years_of_experience, proficiency, category)
VALUES ('ExpressJS', 2, 'Intermediate', 'Frameworks');
INSERT INTO skill (display_name, years_of_experience, proficiency, category)
VALUES ('Angular', 4, 'Advanced', 'Frameworks');
INSERT INTO skill (display_name, years_of_experience, proficiency, category)
VALUES ('AngularJS', 1, 'Intermediate', 'Frameworks');
INSERT INTO skill (display_name, years_of_experience, proficiency, category)
VALUES ('jQuery', 3, 'Intermediate', 'Frameworks');
INSERT INTO skill (display_name, years_of_experience, proficiency, category)
VALUES ('Jasmine', 4, 'Intermediate', 'Frameworks');
INSERT INTO skill (display_name, years_of_experience, proficiency, category)
VALUES ('Karma', 4, 'Intermediate', 'Frameworks');
INSERT INTO skill (display_name, years_of_experience, proficiency, category)
VALUES ('Mocha', 2, 'Intermediate', 'Frameworks');
INSERT INTO skill (display_name, years_of_experience, proficiency, category)
VALUES ('Chai', 2, 'Intermediate', 'Frameworks');
INSERT INTO skill (display_name, years_of_experience, proficiency, category)
VALUES ('Ionic', 2, 'Intermediate', 'Frameworks');
INSERT INTO skill (display_name, years_of_experience, proficiency, category)
VALUES ('SQL', 5.5, 'Intermediate', 'Programing Languages');
INSERT INTO skill (display_name, years_of_experience, proficiency, category)
VALUES ('Go', 1, 'Novice', 'Programing Languages');
INSERT INTO skill (display_name, years_of_experience, proficiency, category)
VALUES ('Gin', 1, 'Novice', 'Frameworks');
INSERT INTO skill (display_name, years_of_experience, proficiency, category)
VALUES ('HTML', 5.5, 'Advanced', 'Frontend Tools');
INSERT INTO skill (display_name, years_of_experience, proficiency, category)
VALUES ('CSS', 3, 'Intermediate', 'Frontend Tools');
INSERT INTO skill (display_name, years_of_experience, proficiency, category)
VALUES ('Git', 4, 'Advanced', 'Version Control Systems');
INSERT INTO skill (display_name, years_of_experience, proficiency, category)
VALUES ('Subversion', 1, 'Novice', 'Version Control Systems');
INSERT INTO skill (display_name, years_of_experience, proficiency, category)
VALUES ('Dart', 1, 'Novice', 'Programming Languages');
INSERT INTO skill (display_name, years_of_experience, proficiency, category)
VALUES ('Flutter', 1, 'Novice', 'Frameworks');
INSERT INTO skill (display_name, years_of_experience, proficiency, category)
VALUES ('Maven', 4, 'Advanced', 'Dependency Management');
INSERT INTO skill (display_name, years_of_experience, proficiency, category)
VALUES ('Bazel', 2, 'Advanced', 'Dependency Management');
INSERT INTO skill (display_name, years_of_experience, proficiency, category)
VALUES ('NPM', 4, 'Advanced', 'Dependency Management');
INSERT INTO skill (display_name, years_of_experience, proficiency, category)
VALUES ('Docker', 2.5, 'Intermediate', 'CI/CD');
INSERT INTO skill (display_name, years_of_experience, proficiency, category)
VALUES ('Jenkins', 2.5, 'Intermediate', 'CI/CD');
INSERT INTO skill (display_name, years_of_experience, proficiency, category)
VALUES ('Scrum', 4, 'Advanced', 'Methodologies');
INSERT INTO skill (display_name, years_of_experience, proficiency, category)
VALUES ('Waterfall', 4, 'Advanced', 'Methodologies');
INSERT INTO skill (display_name, years_of_experience, proficiency, category)
VALUES ('Knowledge Sharing', 2, 'Intermediate', 'Soft Skills');
INSERT INTO skill (display_name, years_of_experience, proficiency, category)
VALUES ('Leading Teams', 2, 'Intermediate', 'Soft Skills');
INSERT INTO skill (display_name, years_of_experience, proficiency, category)
VALUES ('Technical Interviewing', 2, 'Intermediate', 'Soft Skills');

-- Professional Experience
INSERT INTO professional_experience (id, role_title, company, start_date, end_date)
VALUES (1, 'Lead Software Engineer', 'EPAM Systems', '2020-09-01', NULL);
INSERT INTO professional_experience (id, role_title, company, start_date, end_date)
VALUES (2, 'Software Engineer', 'Wipro Technologies', '2019-10-01', '2020-08-01');
INSERT INTO professional_experience (id, role_title, company, start_date, end_date)
VALUES (3, 'Java FullStack Developer', 'Allutiq LLC', '2019-05-01', '2019-10-01');
INSERT INTO professional_experience (id, role_title, company, start_date, end_date)
VALUES (4, 'Java Jr Developer', 'Xideral', '2018-06-01', '2019-04-01');
INSERT INTO professional_experience (id, role_title, company, start_date, end_date)
VALUES (5, 'Java Developer Intern', 'Praxis', '2017-03-01', '2018-06-01');

-- Professional Experience Achievements
INSERT INTO professional_experience_achievements (professional_experience_id, achievements)
VALUES (1, 'Collaborated imparting a course to non-developer on how to develop using JavaScript.');
INSERT INTO professional_experience_achievements (professional_experience_id, achievements)
VALUES (1, 'Collaborated in several projects for the world largest internet search engine.');
INSERT INTO professional_experience_achievements (professional_experience_id, achievements)
VALUES (1, 'Collaborated as a mentor for Angular.');
INSERT INTO professional_experience_achievements (professional_experience_id, achievements)
VALUES (1, 'Collaborated as a mentor for a Growth Program based in JavaScript.');
INSERT INTO professional_experience_achievements (professional_experience_id, achievements)
VALUES (1, 'Undertook a certification to become a Technical Interviewer.');
INSERT INTO professional_experience_achievements (professional_experience_id, achievements)
VALUES (1, 'Promoted to Lead Software Engineer.');

INSERT INTO professional_experience_achievements (professional_experience_id, achievements)
VALUES (2, 'Collaborated definind a documentation styleguide, coding styleguide and improved code quality delivery.');
INSERT INTO professional_experience_achievements (professional_experience_id, achievements)
VALUES (2, 'Served as a temporary Tech lead for small development team.');
INSERT INTO professional_experience_achievements (professional_experience_id, achievements)
VALUES (2, 'Collaborated in the maintenance of a productive application for a financial customer.');

INSERT INTO professional_experience_achievements (professional_experience_id, achievements)
VALUES (3, 'Created an Angular application from scratch.');
INSERT INTO professional_experience_achievements (professional_experience_id, achievements)
VALUES (3, 'Created an ExpressJS JWT Authentication Microservice using AWS, Docker and Jenkins.');
INSERT INTO professional_experience_achievements (professional_experience_id, achievements)
VALUES (3, 'Collaborated in the maintenance of a microservice suite.');
INSERT INTO professional_experience_achievements (professional_experience_id, achievements)
VALUES (3, 'Collaborated in the documentation of a microservice suite.');

INSERT INTO professional_experience_achievements (professional_experience_id, achievements)
VALUES (4, 'In charge of User Support L1, L2, L3.');
INSERT INTO professional_experience_achievements (professional_experience_id, achievements)
VALUES (4, 'Collaborated in general maintenance and development of new features for a monolithic web application.');
INSERT INTO professional_experience_achievements (professional_experience_id, achievements)
VALUES (4, 'Collaborated in the architecture migration of said application into microservices.');
INSERT INTO professional_experience_achievements (professional_experience_id, achievements)
VALUES (4, 'Collaborated in the development of a mobile application.');

INSERT INTO professional_experience_achievements (professional_experience_id, achievements)
VALUES (5, 'Created a JavaFX application to support the development team needs.');
INSERT INTO professional_experience_achievements (professional_experience_id, achievements)
VALUES (5, 'Collaborated in the development of key features of a monolithic application.');
INSERT INTO professional_experience_achievements (professional_experience_id, achievements)
VALUES (5, 'Collaborated in customer facing meetings.');
