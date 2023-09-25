function fn() {

  var config = { // base config JSON

    urlServeur : 'https://reqres.in/api/users?page=1'


  };

  karate.configure('connectTimeout', 5000);
  karate.configure('readTimeout', 5000);
  karate.configure('ssl', { trustAll: true });
  return config;
}