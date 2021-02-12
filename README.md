# Asset Plugins for Arena

Association of asset with external object is implemented through a specific lookup. An out of box Arena interface provides the ability to define lookup plugins to add lookup support for other external objects (for example, lookup users from Active Directory).

To use:

1. Use the `LookupService` interface for lookup implementation.
2. See the `example/AniLookup.java` file for example.
3. Build a .jar file to implement the asset association.
4. Ensure that the newly generated .jar file is available in the path `/opt/zdp/zdp-gateway/lib/plugins/lookup/` where zdp-gateway is sinalled.
4. Define the association relationship as below:
```yaml
relationship.kind: "ASSOCIATION",
relationship.target: "<target name of the object. This value should match the string getType method of the plugin returns.>",
relationship.cardinality: "1.1" OR "1.*",
relationship.source: "The attribute for which the asset instances will be listed out from the target asset type. "
```
5. Restart zdp-gateway service.
6. Go to the Arena UI to apply the associations.

## License

These files are provided as-is without warranty and are licensed under the Apache License 2.0