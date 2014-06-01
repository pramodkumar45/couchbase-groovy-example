import com.couchbase.client.CouchbaseClient

hosts = Arrays.asList(new URI("http://localhost:8091/pools"))
client = new CouchbaseClient(hosts, "default", "")

println client.set("foo", "bar").getStatus()
println client.get("foo")

client.shutdown()
